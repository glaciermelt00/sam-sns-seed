addSbtPlugin("com.github.dnvriend" % "sbt-sam-plugin" % "1.0.27")

resolvers += Resolver.url("bintray-dnvriend-ivy-sbt-plugins", url("http://dl.bintray.com/dnvriend/sbt-plugins"))(Resolver.ivyStylePatterns).withAllowInsecureProtocol(true)
resolvers += Resolver.bintrayRepo("dnvriend", "maven")
