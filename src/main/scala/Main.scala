import zio.ExitCode
import zio.ZIO
import zio.App
import zio.Has
import service.ServiceA
import zio.ZLayer
import service.ServiceB

object Main extends App {

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, ExitCode] = {

    val program: ZIO[Has[ServiceA.Service], Throwable, Unit] = 
      ServiceA.functionA(5)
    

    val serviceLayer: ZLayer[Any, Throwable, Has[ServiceA.Service]] =
      ServiceB.live >>> ServiceA.live

    program.provideLayer(serviceLayer).exitCode
  }

}
