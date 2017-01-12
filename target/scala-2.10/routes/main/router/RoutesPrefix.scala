
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/COAssist/conf/routes
// @DATE:Thu Jan 12 11:28:12 MST 2017


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
