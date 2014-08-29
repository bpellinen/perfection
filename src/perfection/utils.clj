(ns perfection.utils)

(defmacro b
  ([f]
   `(perfection.utils/benchmark  (fn  [] ~f)))

  ([msg f]
   `(perfection.utils/benchmark ~msg  (fn  [] ~f))))
