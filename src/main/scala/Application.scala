class Application {
  def run(args: Array[String]): Unit = {
     println("Hello world!")
  }
}

object Application extends App {
  override def main(args: Array[String]): Unit = {
    new Application().run(args)
  }
}
