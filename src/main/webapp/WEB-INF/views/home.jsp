<html lang="ko">
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<div class="sound-list">
		<div class="sound-container">
			<h3>Rain</h3>
			<i class="fa-solid fa-cloud-rain fa-2xl"></i>
			<audio
				src="https://drive.google.com/uc?export=download&id=1DtXxRAashe4IyXzwQCJRzFONnRWopgSD"
				loop="loop" preload="auto">
			</audio>
			<label for="volume"></label> <input type="range" id="ex-in"
				name="volume" min="0" max="10">
			<div id="ex-out"></div>
		</div>
		<div class="sound-container">
			<h3>Thunder</h3>
			<i class="fa-solid fa-cloud-bolt fa-2xl"></i>
			<audio
				src="https://drive.google.com/uc?export=download&id=1JhmuJQRM7VszN3xTM92yLnlFjLLaUcJQ"
				loop="loop" preload="auto">
			</audio>
			<label for="volume"></label> <input type="range" id="ex-in"
				name="volume" min="0" max="10">
			<div id="ex-out"></div>
		</div>
		<div class="sound-container">
			<h3>Fan</h3>
			<i class="fa-solid fa-fan fa-2xl"></i>
			<audio
				src="https://drive.google.com/uc?export=download&id=1JWCPoDpyO-0CPgmLJ-iYJkzNnIxKaFTc"
				loop="loop" preload="auto">
			</audio>
			<label for="volume"></label> <input type="range" id="ex-in"
				name="volume" min="0" max="10">
			<div id="ex-out"></div>
		</div>
	</div>
</body>
</html>