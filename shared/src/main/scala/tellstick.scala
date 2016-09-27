
object TellstickTest {

  def testTellstick() {
    println("Hi")

    TelldusCore.tdInit()
    //
     //val cb: TDDeviceEvent = callback
    //
    /*
    TelldusCore.tdRegisterDeviceEvent( (deviceId: CInt, method: CInt, data: CString, callbackId: CInt, context: Ptr[_]) => {
      fprintf(stdout, c"DeviceId: %i, method: %i, data: %s\n", deviceId, method, data)
      fflush(stdout)
    }: Unit, stdlib.malloc(1))
*/
    //TelldusCore.tdRegisterDeviceEvent(callback _, stdlib.malloc(1))

    TelldusCore.tdTurnOn(1)
    Thread.sleep(2000)
    TelldusCore.tdTurnOff(1)

    Thread.sleep(5000)

    TelldusCore.tdClose()
  }
}
