package bootstrap.liftweb

import net.liftweb.http.{Html5Properties, LiftRules, Req}
import net.liftweb.sitemap.{Menu, SiteMap}


class Boot {
  def boot {
    // where to search snippet
    LiftRules.addToPackages("net.scalapro.liftportal")

    // Build SiteMap
    val entries = List(
      Menu.i("Home") / "index"
    )

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))

    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    LiftRules.setSiteMap(SiteMap(entries: _*))
  }
}
