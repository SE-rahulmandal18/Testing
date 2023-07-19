Local $hWnd=WinWait("[CLASS:#32770]","",10)

ControlFocus($hWnd,"","Edit1")

Sleep(2000)

ControlSetText($hWnd, "", "Edit1", "D:\tmp\SS.jpg")

Sleep(2000)

ControlFocus($hWnd,"","Button1")

ControlClick($hWnd, "","Button1");