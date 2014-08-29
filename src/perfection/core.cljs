(ns perfection.core
  (:require-macros [perfection.utils :refer (b)])
  (:require [perfection.utils :as u]))

(.log js/console "Hello world!!")

(defn add [a b]
  (+ a b))

(.log js/console "test")

( b (u/p 1 2 3) )
