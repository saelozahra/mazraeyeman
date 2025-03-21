B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	
End Sub

Sub Globals
	Dim CP As ContactPicker
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Activity.LoadLayout("Layout1")
	CP.Initialize(Activity)
	CP.ShowContactPicker
End Sub

Sub CP_Complete (ListOfContacts As List)
	For i = 0 To ListOfContacts.Size-1
		Log(ListOfContacts.Get(i))
	Next
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
