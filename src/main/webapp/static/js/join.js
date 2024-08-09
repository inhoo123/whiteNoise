const INPUT_INDEX = {
  user_email: 0,
  user_password: 1,
  user_nick: 2,
  BUTTON: 3,
};
const ERROR_MESSAGE = [
  "email 을 입력해주세요",
  "password 를 입력해주세요",
  "nick Name 을 입력해주세요",
];
document.addEventListener("DOMContentLoaded", () => {
  const join_form = document.querySelector("form.user.join");
  // form > input 전체를 배열로 추출하기
  const join_inputs = join_form.querySelectorAll("input");
  const error_inputs = join_form.querySelectorAll("span");

  const emptyValid = (index) => {
    // const text = join_form[index].value
    const text = join_inputs[index].value;
    if (!text) {
      error_inputs[index].textContent = ERROR_MESSAGE[index];
      error_inputs[index].style.display = "inline-block";
      join_inputs[index].select();
      return false;
    }
    return true;
  };

  const onJoinSumbit = () => {
    // span tag 개수만큼 반복하면서 emptyValid 함수를 사용하여
    // 값이 입력되지 않은 상황을 검사하기
    let yesValid = true;
    for (let i = 0; i < error_inputs.length; i++) {
      const span = error_inputs[i];
      span.style.display = "none";
      if (!(yesValid = emptyValid(i))) break;
    }
    if (yesValid) join_form.submit();
  };

  // join_inputs[4]
  join_inputs[INPUT_INDEX.BUTTON].addEventListener("click", onJoinSumbit);
});
