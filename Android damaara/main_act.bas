B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: true
	#IncludeTitle: False
#End Region

Sub Process_Globals
	
End Sub

Sub Globals
	Private header_lbl ,subtitle_lbl As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("home_layout")
	
	header_lbl.Typeface=SaeloZahra.font
	subtitle_lbl.Typeface=SaeloZahra.font
	
	Dim csb_sub As CSBuilder
	csb_sub.Initialize
	csb_sub.Typeface(SaeloZahra.font)
	csb_sub.Bold
	csb_sub.Color(Colors.White)
	csb_sub.Append(" آقای ")
	csb_sub.Color(0xFFFFCD44)
	csb_sub.Append(" محمد محمدی ")
	csb_sub.Color(Colors.White)
	csb_sub.Append(" خوش آمدید ")
	subtitle_lbl.Typeface=SaeloZahra.font
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub login_btn_Click
	Dim media As MediaPlayer
	media.Initialize2("media")
	media.Load(File.DirAssets,"button-20.mp3")
	media.Play
'	StartActivity(SaeloZahra.pi.PlayAudio(File.DirAssets,"button-20.mp3"))
End Sub