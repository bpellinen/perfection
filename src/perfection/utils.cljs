(ns perfection.utils)
(enable-console-print!)

(defn p  [& values]
  "Prints the value, and then returns it"
  (.log js/console  (apply pr-str values))
  (last values))

(defn benchmark
  "Prints the execution time for the given function. Accepts optional string, which will be used as a description"
  ([f]  (benchmark nil f))
  ([msg f]
   (let  [start  (.now js/Date)
          result  (f)]
     (p  (str  (when msg  (str msg  ": "))  (-  (.now js/Date) start)  "ms"))
     result)))

