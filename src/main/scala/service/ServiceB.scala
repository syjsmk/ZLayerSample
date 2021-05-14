package service

import zio.Task
import zio.UIO
import zio.ZIO
import zio.Has
import zio.ZLayer

object ServiceB {

    trait Service {
        def functionB(v: Int): Task[Unit]
    }

    val live: ZLayer[Any, Throwable, Has[ServiceB.Service]] = ZLayer.succeed {
        new Service {
            override def functionB(v: Int): Task[Unit] = Task { println("serviceB : " + v) }
        }
    }

    def functionB(v: Int): ZIO[Has[ServiceB.Service], Throwable, Unit] = ZIO.accessM(_.get.functionB(v))

}