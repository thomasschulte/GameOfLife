(System.Reflection.Assembly/LoadWithPartialName "System.Windows.Forms")

(ns program
  (:import [System.Windows.Forms Application])
  (:gen-class)
  (:require GameOfLife)
)

(defn -main [& args]
			(Application/EnableVisualStyles)
			(Application/SetCompatibleTextRenderingDefault false)
			(Application/Run (GameOfLife/game-of-life 50))
)