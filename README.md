# whiteNoise
구글 드라이브를 활용해서 mp3 파일 올리고 audio 태그 활용하기
1. 구글 드라이브에서 접속 공유할 파일에 오른쪽 마우스클릭 메뉴 중에서 공유를 선택합니다.
2. 공유(Share)를 선택하면 액세스 권한이 비공개로 되어 있을텐데, 이것을 "변경"버튼 선택 고급 설정을 들어가면 보입니다.
3. 웹에 공개 또는 링크가 있는 모든 사용자에게 공개를 선택하고 저장합니다
4. 저장하면 "공유할 링크" URL 주소를 복사합니다
5. 아래 사이트에 접속해서 복사한 URL을 붙여넣기하고 생성하면 직접연결 링크가 생성됩니다.
https://sites.google.com/site/gdocs2direct/
6. 다운로드 url을 만들고 그 뒤 url로 audio태그를 사용 해주면 됩니다.
(예시) 
```xml
<audio src="url" autoplay="true" controls="true"></audio>
```
음향 다운로드 받은곳
https://pixabay.com/ko/