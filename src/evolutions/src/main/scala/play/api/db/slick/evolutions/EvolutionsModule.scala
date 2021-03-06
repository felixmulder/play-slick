package play.api.db.slick.evolutions

import javax.inject.Singleton
import play.api.Configuration
import play.api.Environment
import play.api.db.DBApi
import play.api.db.slick.evolutions.internal.DBApiAdapter
import play.api.inject.Binding
import play.api.inject.Module

@Singleton
class EvolutionsModule extends Module {
  def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = {
    Seq(bind[DBApi].to[DBApiAdapter].in[Singleton])
  }
}