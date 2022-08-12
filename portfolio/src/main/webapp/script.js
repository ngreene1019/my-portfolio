// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random quote to the page.
 */
function addRandomGreeting() {
    const greetings =
        ['“Ive learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.” ~ Maya Angelou', '"Strive for progress, not perfection." ~Anonymous', '"Focus on the step in front of you, not the whole starcase." ~ Anonymous'];
  
    // Pick a random greeting.
    const greeting = greetings[Math.floor(Math.random() * greetings.length)];
  
    // Add it to the page.
    const greetingContainer = document.getElementById('greeting-container');
    greetingContainer.innerText = greeting;
  }

  async function showThanks() {
    const responseFromServer = await fetch('/thankYou');
    const textFromResponse = await responseFromServer.text();
  
    const dateContainer = document.getElementById('thanks-container');
    dateContainer.innerText = textFromResponse;
  }