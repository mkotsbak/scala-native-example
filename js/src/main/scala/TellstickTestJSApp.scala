import scala.scalajs.js.JSApp

object Sleep {
  import scala.scalajs.js.Dynamic.{global => g}
  private val sleepLib = g.require("sleep")

  def sleep(millis: Long) = sleepLib.usleep(millis * 1000)
}

object TellstickJSApp extends JSApp {
  override def main(): Unit = {
    TellstickTest.testTellstick()
  }
}
