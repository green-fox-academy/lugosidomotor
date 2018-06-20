# https://www.youtube.com/watch?v=bf_UOFFaHiY

import time

from PIL import ImageGrab
import pyautogui

class Cordinates ():
   replayBtn = (480, 400)
   dinosaur = (245, 410)

def restartGame ():
    pyautogui.click(Cordinates.replayBtn)

def pressSpace():
    pyautogui.keyDown('space')
    time.sleep(0.05)

    print("Jump")
    pyautogui.keyUp('space')


restartGame()
pressSpace()




