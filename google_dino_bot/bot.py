# https://www.youtube.com/watch?v=bf_UOFFaHiY

import time
from PIL import ImageGrab, ImageOps
import pyautogui
from numpy import *


class Cordinates():
    replayBtn = (480, 400)
    dinosaur = (245, 410)


def restartGame():
    pyautogui.click(Cordinates.replayBtn)


def pressSpace():
    pyautogui.keyDown('space')
    time.sleep(0.05)
    print("Jump")
    pyautogui.keyUp('space')


def imageGrab():
    box = (Cordinates.dinosaur[0] + 100, Cordinates.dinosaur[1] + 30)
    image = ImageGrab.grab(box)
    grayImage = ImageOps.grayscale(image)
    a = array(grayImage.getcolors())
    print(a.sum())


def main():
    restartGame()
    while True:
        print(sum(0))
        if imageGrab() != 1447:
            pressSpace()
            time.sleep(0.1)


main()
