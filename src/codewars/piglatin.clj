(ns codewars.piglatin
  (:require [clojure.string :as string]))
;; Move the first letter of each word to the end of it,
;; then add "ay" to the end of the word. Leave punctuation marks untouched.
;; (piglatin/pig-it "Pig latin is cool") ; "igPay atinlay siay oolcay"
;; (piglatin/pig-it "Hello world !")     ; "elloHay orldway !"

(defn pig-it [s]
  (-> s
      (string/split #"\s")))

(comment
 (-> "Pig latin is cool"
     (string/split #"\s")))