package priv.wjq.sss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name="blog")
@Entity
public class Blog {
    private Integer bId;

    private String bTitle;

    private Integer bViewnum;

    private Integer bCommentnum;

    private String bUrl;

    private String bTags;

    private String bSort;

    private String bIssuetime;

    private String bAuthorhome;

    private String bContent;
    
    //级联属性
    
    private WebSite webSite;
    
    
    
    @JoinColumn(name="webid")
    @ManyToOne
    public WebSite getWebSite() {
		return webSite;
	}

	public void setWebSite(WebSite webSite) {
		this.webSite = webSite;
	}

	@GeneratedValue
	@Id
    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }


    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle == null ? null : bTitle.trim();
    }

    public Integer getbViewnum() {
        return bViewnum;
    }

    public void setbViewnum(Integer bViewnum) {
        this.bViewnum = bViewnum;
    }

    public Integer getbCommentnum() {
        return bCommentnum;
    }

    public void setbCommentnum(Integer bCommentnum) {
        this.bCommentnum = bCommentnum;
    }

    public String getbUrl() {
        return bUrl;
    }

    public void setbUrl(String bUrl) {
        this.bUrl = bUrl == null ? null : bUrl.trim();
    }

    public String getbTags() {
        return bTags;
    }

    public void setbTags(String bTags) {
        this.bTags = bTags == null ? null : bTags.trim();
    }

    public String getbSort() {
        return bSort;
    }

    public void setbSort(String bSort) {
        this.bSort = bSort == null ? null : bSort.trim();
    }

    public String getbIssuetime() {
        return bIssuetime;
    }

    public void setbIssuetime(String bIssuetime) {
        this.bIssuetime = bIssuetime == null ? null : bIssuetime.trim();
    }

    public String getbAuthorhome() {
        return bAuthorhome;
    }

    public void setbAuthorhome(String bAuthorhome) {
        this.bAuthorhome = bAuthorhome == null ? null : bAuthorhome.trim();
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent == null ? null : bContent.trim();
    }
}