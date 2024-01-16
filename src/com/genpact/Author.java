package com.genpact;

public class Author {

	 private String authorName;
	    private String authorBio;

	    public Author(String authorName, String authorBio) {
	        this.authorName = authorName;
	        this.authorBio = authorBio;
	    }

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public String getAuthorBio() {
			return authorBio;
		}

		public void setAuthorBio(String authorBio) {
			this.authorBio = authorBio;
		}

		@Override
		public String toString() {
			return "Author [authorName=" + authorName + ", authorBio=" + authorBio + "]";
		}
	    
	    
}
