// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desenvolvedor0/Documentos/playframework/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Wed Jul 17 14:38:01 BRT 2019


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
