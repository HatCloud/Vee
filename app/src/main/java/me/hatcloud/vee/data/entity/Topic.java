package me.hatcloud.vee.data.entity;

/**
 * Created by Jeff on 05/03/2017.
 */

public class Topic extends BaseEntity{

    /**
     * id : 128177
     * title : vim-translator
     * url : http://www.v2ex.com/t/128177
     * content : 一个轻巧的vim下的翻译和发音插件，依赖于 google-translator-cli，或者其他的命令行翻译，查询工具。发音取自google...

     https://github.com/farseer90718/vim-translator

     功能比较简单。暂时只是实现了个人的需求...
     * content_rendered : 一个轻巧的vim下的翻译和发音插件，依赖于 google-translator-cli，或者其他的命令行翻译，查询工具。发音取自google...<br /><br /><a target="_blank" href="https://github.com/farseer90718/vim-translator" rel="nofollow">https://github.com/farseer90718/vim-translator</a><br /><br />功能比较简单。暂时只是实现了个人的需求...
     * replies : 0
     * member : {"id":67060,"username":"farseer2014","tagline":"","avatar_mini":"//cdn.v2ex.com/avatar/6766/2b3d/67060_mini.png?m=1408121347","avatar_normal":"//cdn.v2ex.com/avatar/6766/2b3d/67060_normal.png?m=1408121347","avatar_large":"//cdn.v2ex.com/avatar/6766/2b3d/67060_large.png?m=1408121347"}
     * node : {"id":17,"name":"create","title":"分享创造","title_alternative":"Create","url":"http://www.v2ex.com/go/create","topics":2621,"avatar_mini":"//cdn.v2ex.com/navatar/70ef/df2e/17_mini.png?m=1388448923","avatar_normal":"//cdn.v2ex.com/navatar/70ef/df2e/17_normal.png?m=1388448923","avatar_large":"//cdn.v2ex.com/navatar/70ef/df2e/17_large.png?m=1388448923"}
     * created : 1408122614
     * last_modified : 1408122614
     * last_touched : 1408122434
     */

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;
    private int replies;
    private MemberBean member;
    private NodeBean node;
    private int created;
    private int last_modified;
    private int last_touched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public MemberBean getMember() {
        return member;
    }

    public void setMember(MemberBean member) {
        this.member = member;
    }

    public NodeBean getNode() {
        return node;
    }

    public void setNode(NodeBean node) {
        this.node = node;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public int getLast_touched() {
        return last_touched;
    }

    public void setLast_touched(int last_touched) {
        this.last_touched = last_touched;
    }

    public static class MemberBean {
        /**
         * id : 67060
         * username : farseer2014
         * tagline :
         * avatar_mini : //cdn.v2ex.com/avatar/6766/2b3d/67060_mini.png?m=1408121347
         * avatar_normal : //cdn.v2ex.com/avatar/6766/2b3d/67060_normal.png?m=1408121347
         * avatar_large : //cdn.v2ex.com/avatar/6766/2b3d/67060_large.png?m=1408121347
         */

        private int id;
        private String username;
        private String tagline;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }

    public static class NodeBean {
        /**
         * id : 17
         * name : create
         * title : 分享创造
         * title_alternative : Create
         * url : http://www.v2ex.com/go/create
         * topics : 2621
         * avatar_mini : //cdn.v2ex.com/navatar/70ef/df2e/17_mini.png?m=1388448923
         * avatar_normal : //cdn.v2ex.com/navatar/70ef/df2e/17_normal.png?m=1388448923
         * avatar_large : //cdn.v2ex.com/navatar/70ef/df2e/17_large.png?m=1388448923
         */

        private int id;
        private String name;
        private String title;
        private String title_alternative;
        private String url;
        private int topics;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle_alternative() {
            return title_alternative;
        }

        public void setTitle_alternative(String title_alternative) {
            this.title_alternative = title_alternative;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getTopics() {
            return topics;
        }

        public void setTopics(int topics) {
            this.topics = topics;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }
}
