
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/COAssist/conf/routes
// @DATE:Wed Jan 04 08:49:46 MST 2017


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
