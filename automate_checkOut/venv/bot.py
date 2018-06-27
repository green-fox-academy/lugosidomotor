import time

import PIL
import pyautogui

class Cordinates ():
   toDesktop = (1918, 1076)
   openSlack = (200, 45)
   openFulvipes =(50,480)
   goToChat = (400,995)

def goToSpam ():
    pyautogui.click(Cordinates.toDesktop)
    time.sleep(1)
    pyautogui.click(Cordinates.openSlack)
    pyautogui.click(Cordinates.openSlack)
    pyautogui.click(Cordinates.openSlack)
    time.sleep(1)
    pyautogui.click(Cordinates.openFulvipes)
    time.sleep(1)
    pyautogui.click(Cordinates.goToChat)
    time.sleep(1)
    pyautogui.typewrite('Roko gyikja eljott erted!')
    time.sleep(1)
    pyautogui.keyDown('enter')
    time.sleep(0.1)
    pyautogui.keyUp('enter')

for i in range(1,10):
    goToSpam()



