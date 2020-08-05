(defproject neandertest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [uncomplicate/neanderthal "0.25.3"]
                 [com.github.haifengl/smile-mkl "2.5.0"]
                 [org.bytedeco/mkl-platform "2020.1-1.5.3"]
                 [org.bytedeco/mkl-platform-redist "2020.1-1.5.3"]
;                 [incanter "LATEST"]
;                 [org.clojure/tools.nrepl "LATEST"]
;                 [nrepl "LATEST"]
;                 [cider/cider-nrepl "LATEST"]
                 ]
  ;; :plugins [[cider/cider-nrepl "LATEST"]
  ;;           [lein-with-env-vars "0.1.0"]]
  
  ;:env-vars {:PATH "C:/Program Files (x86)\IntelSWTools\compilers_and_libraries\windows\redist\intel64_win\mkl"}
;  :java-cmd "C:/Users/Mahesvara/Downloads/jdk-12.0.1/bin/java"
;  :jvm-opts ["--add-opens=java.base/jdk.internal.ref=ALL-UNNAMED"]

;  :main ^:skip-aot testing-grounds.core
;  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
