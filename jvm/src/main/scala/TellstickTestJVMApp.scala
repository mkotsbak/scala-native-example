
object Sleep {
  def sleep(millis: Long) = Thread.sleep(millis)
}

object TellstickApp extends App {
  TellstickTest.testTellstick()
}
