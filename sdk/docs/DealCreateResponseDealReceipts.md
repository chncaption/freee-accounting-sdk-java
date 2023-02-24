

# DealCreateResponseDealReceipts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** | 作成日時（ISO8601形式） | 
**description** | **String** | メモ |  [optional]
**id** | **Integer** | ファイルボックス（証憑ファイル）ID | 
**issueDate** | **String** | 発生日 |  [optional]
**mimeType** | **String** | MIMEタイプ | 
**origin** | [**OriginEnum**](#OriginEnum) | アップロード元種別 | 
**receiptMetadatum** | [**DealReceiptMetadatum**](DealReceiptMetadatum.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | ステータス(confirmed:確認済み、deleted:削除済み、ignored:無視) | 
**user** | [**DealUser**](DealUser.md) |  | 



## Enum: OriginEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
WEB | &quot;web&quot;
MOBILE_CAMERA | &quot;mobile_camera&quot;
MOBILE_ALBUM | &quot;mobile_album&quot;
SCANSNAP | &quot;scansnap&quot;
SCANNABLE | &quot;scannable&quot;
DROPBOX | &quot;dropbox&quot;
MAIL | &quot;mail&quot;
SAFETY_CONTACT_FILE | &quot;safety_contact_file&quot;
PUBLIC_API | &quot;public_api&quot;



## Enum: StatusEnum

Name | Value
---- | -----
CONFIRMED | &quot;confirmed&quot;
DELETED | &quot;deleted&quot;
IGNORED | &quot;ignored&quot;



