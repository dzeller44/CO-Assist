
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace2/CO-Assist/conf/routes
// @DATE:Wed Dec 21 10:41:44 MST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
