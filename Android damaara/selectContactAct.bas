B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region


Sub Process_Globals
	Dim cu As ContactsUtils
End Sub

Sub Globals
	
	Private ListView1 As ListView
	Private search_contact_et As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("selectContactLayout")
	
	search_contact_et.Typeface=SaeloZahra.font
	
	If Not(cu.IsInitialized) Then
		cu.Initialize
	End If
	
	For Each c As cuContact In cu.FindAllContacts(True)
'		Dim btm As Bitmap
'		btm.Initialize(File.DirAssets,"icon.png")
'		If cu.GetPhoto(c.Id).IsInitialized Then btm=cu.GetPhoto(c.Id) Else btm.Initialize(File.DirAssets,"icon.png")
		ListView1.AddSingleLine2(c.DisplayName, c)
	Next
	
	ListView1.SingleLineLayout.Label.TextColor=Colors.DarkGray
	ListView1.SingleLineLayout.Label.Left=-20dip
	ListView1.SingleLineLayout.Label.Typeface=SaeloZahra.font
	
'	Main.amaroid.TrackView("انتخاب مخاطبین - قدیم")
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim c As cuContact = Value
'	Dim bmp As Bitmap = cu.GetPhoto(c.Id)
'	If bmp.IsInitialized Then ImageView1.SetBackgroundImage(bmp) Else ImageView1.SetBackgroundImage(Null)
'	Dim sb As StringBuilder
'	sb.Initialize
'	sb.Append(c.DisplayName).Append(CRLF).Append("Note: ").Append(cu.GetNote(c.Id)).Append(CRLF)
'	sb.Append("Starred: ").Append(cu.GetStarred(c.Id)).Append(CRLF)
	Dim oldlist As List
	If File.Exists(SaeloZahra.dir,"cl.list") Then oldlist=File.ReadList(SaeloZahra.dir,"cl.list") Else oldlist.Initialize
	For Each phone As cuPhone In cu.GetPhones(c.Id)
'		sb.Append(phone.Number & ", " & phone.PhoneType).Append(CRLF)
		oldlist.Add(phone.Number)
		File.WriteList(SaeloZahra.dir,"cl.list",oldlist)
		ToastMessageShow(c.DisplayName&" به لیست اضافه شد",True)
		Activity.Finish
	Next
'	For Each email As cuEmail In cu.GetEmails(c.Id)
'		sb.Append(email.email).Append(", ").Append(email.EmailType).Append(CRLF)
'	Next
'	EditText1.Text = sb.ToString
	
End Sub




Sub search_contact_et_TextChanged (Old As String, New As String)
	If cu.IsInitialized Then
		If New.Length=0 Then
			For Each c As cuContact In cu.FindAllContacts(True)
				ListView1.AddSingleLine2(c.DisplayName, c)
			Next
		Else
			ListView1.Clear
			For Each c As cuContact In cu.FindContactsByName(New,False,True)
				ListView1.AddSingleLine2(c.DisplayName, c)
			Next
		End If
	End If
End Sub