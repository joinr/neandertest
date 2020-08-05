(defproject neandertest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [uncomplicate/neanderthal "0.25.3"]
                 #_[com.github.haifengl/smile-mkl "2.5.0"]
                 [org.bytedeco/mkl-platform "2020.1-1.5.3"]
                 [org.bytedeco/mkl-platform-redist "2020.1-1.5.3"]
                 ]
  :profiles {:uberjar {:aot :all}})
