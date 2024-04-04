package carbonneutral.academy.user.entity.enums;

public enum SocialType {
    NONE("none"),
    GOOGLE("google"),
    KAKAO("kakao"),
    NAVER("naver");

    private final String description;

    SocialType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
