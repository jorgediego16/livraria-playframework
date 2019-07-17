// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desenvolvedor0/Documentos/livraria-playframework/conf/routes
// @DATE:Wed Jul 17 15:29:33 BRT 2019


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
