(defproject kata-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev     {:plugins      [[lein-midje "3.2.1"] [lein-cloverage "1.0.10"]]
                       :dependencies [[midje "1.9.1"] [greenpowermonitor/test-doubles "0.1.2"]]}}
  )