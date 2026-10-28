const { shortestWord } = require("./GozaimasuKata.js");

test("Test that method returns smallest word in a sentence", () => {
  let actual = shortestWord("There is a tide");
  let expected = "a";
  expect(expected).toBe(actual);
});
