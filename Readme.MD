# Log4J2CancelMessage
なんか脆弱性がすごそうだったから作った<br>
多分これでクライアント側はPatternが間違ってなかったらなんとかなる<br>
サーバーももしかしたらどうにかなるかも

## 仕組み
脆弱性に利用されるメッセージを検知して安全な文字列に置き換えます。<br>
ログが出るとだめならサーバー側もログ変わってるしなんとかなるかも

## 注意点
適当です。サーバーやクライアントが対応してるならそっち使ってください