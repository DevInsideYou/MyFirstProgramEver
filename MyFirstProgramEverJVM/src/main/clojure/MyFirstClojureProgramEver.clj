; Use http://app.klipse.tech/ to play with the code

(defn asleep
  ([hour] (message hour "asleep")))

(defn awake
  ([hour] (message hour "awake")))

(defn message
  ([hour state] (str "It's " hour " o'clock, so I'm " state)))

(defn while
  ([isWorkday currentHour limit]
    (if(== currentHour limit) nil
    (cons (if isWorkday
            (cond
              (< currentHour 7) (asleep currentHour)
              (< currentHour 23) (awake currentHour)
              :else (asleep currentHour))
            (if
              (< currentHour 9) (asleep currentHour)
                                (awake currentHour)))
          (while isWorkday (+ currentHour 1) limit)))))

(doseq [item (while true 0 #_("12am") 24)]
 (println item))
