package com.myboot03.board.service;

import java.util.List;
import java.util.Map;

import com.myboot03.board.vo.ArticleVO;

public interface BoardService {

	public List<ArticleVO> listArticles() throws Exception;
	public int addNewArticle(Map articleMap) throws Exception;
	public ArticleVO viewArticle(int articleNO) throws Exception;
	public void modArticle(Map articleMap) throws Exception;
	public void removeArticle(int articleNO)throws Exception;
	public int replyArticle(Map articleMap) throws Exception;
}