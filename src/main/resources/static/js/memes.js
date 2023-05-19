fetch('../json/posts.json')
      .then(response => response.json())
      .then(data => displayPosts(data))
      .catch(error => console.error(error));

    // Display posts in the container
    function displayPosts(posts) {
      const postContainer = document.getElementById('postContainer');

      posts.forEach(post => {
        const postElement = createPostElement(post);
        postContainer.appendChild(postElement);
      });
    }

    // Create a post element
    function createPostElement(post) {
      const postElement = document.createElement('div');
      postElement.className = 'post';

      const titleElement = document.createElement('div');
      titleElement.className = 'title';
      titleElement.textContent = post.title;

      const authorElement = document.createElement('div');
      authorElement.className = 'author';
      authorElement.textContent = 'Posted by ' + post.author;

      const contentElement = document.createElement('div');
      contentElement.className = 'content';
      contentElement.innerHTML = post.content;

      postElement.appendChild(titleElement);
      postElement.appendChild(authorElement);
      postElement.appendChild(contentElement);

      return postElement;
    }