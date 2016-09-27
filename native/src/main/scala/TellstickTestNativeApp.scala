import TelldusCore.TDDeviceEvent

import scalanative.native._
import stdio._
import string._
import FunctionPtr._

@extern object Unistd {
  def usleep(usecs: Long): Int = extern
}

object Sleep {
  def sleep(millis: Long) = Unistd.usleep(millis * 1000)
}

object TellstickApp {

  def callback(deviceId: CInt, method: CInt, data: CString, callbackId: CInt, context: Ptr[_]): Unit = {
    fprintf(stdout, c"DeviceId: %i, method: %i, data: %s", deviceId, method, data)
  }

  def main(args: Array[String]): Unit = {
    //TelldusCore.tdInit()
    //
     //val cb: TDDeviceEvent = callback
    //
    TelldusCore.tdRegisterDeviceEvent( (deviceId: CInt, method: CInt, data: CString, callbackId: CInt, context: Ptr[_]) => {
      fprintf(stdout, c"DeviceId: %i, method: %i, data: %s\n", deviceId, method, data)
      fflush(stdout)
    }: Unit, stdlib.malloc(1))

    //TelldusCore.tdRegisterDeviceEvent(callback _, stdlib.malloc(1))

    TellstickTest.testTellstick()
  }
}
