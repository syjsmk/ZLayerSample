package service

import zio.UIO
import zio.ZLayer
import zio.Has
import zio.Task
import zio.ZIO

object ServiceA {

    trait Service {
        def functionA(v: Int): Task[Unit]
    }

    val live: ZLayer[Has[ServiceB.Service], Nothing, Has[ServiceA.Service]] = ZLayer.fromService { serviceB =>
        new Service {
            override def functionA(v: Int): Task[Unit] = {
                println("Service A called")
                serviceB.functionB(v)
            }
        }
    }

    def functionA(v: Int): ZIO[Has[ServiceA.Service], Throwable, Unit] = ZIO.accessM(_.get.functionA(v))

}