(ns neandertest.core
  (:require #_[neandertest.mkl] ;;no longer necessary!
            [uncomplicate.neanderthal
             [native :refer [dv dge fv fge native-float]]
             [core :refer [submatrix native dot mm ge]]
             [math :refer [sqrt log sin pi sqr]]
             [random :refer [rand-normal! rand-uniform! rng-state]]]))

(comment
(def x (dv 1 2 3))
;; => #'testing-grounds.neanderthal.core/x
(def y (dv 10 20 30))
;; => #'testing-grounds.neanderthal.core/y
(dot x y)
;; => 140.0

(def a (dge 3 2 [1 2 3 4 5 6]))
;; => #'testing-grounds.neanderthal.core/a
(def b (dge 2 3 [10 20 30 40 50 60]))
;; => #'testing-grounds.neanderthal.core/b
(mm a b)

(def x
  "Define an empty float vector"
  (fv 5))
;; => #'testing-grounds.neanderthal.core/x

(rand-uniform! x) ; Error

(def a (fge 3 2))
;; => #'testing-grounds.neanderthal.core/a

(rand-normal! 33 2.5 a) ; Error
)
