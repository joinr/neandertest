(ns neandertest.mkl
  (:import org.bytedeco.mkl.global.mkl_rt
           [org.bytedeco.javacpp Loader]))

#_(import   'org.bytedeco.mkl.global.mkl_rt)
#_(import '[org.bytedeco.javacpp Loader])
(Loader/load org.bytedeco.mkl.global.mkl_rt)
