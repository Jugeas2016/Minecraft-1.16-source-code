/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 74 */   a("always", 0),
/* 75 */   b("never", 1),
/* 76 */   c("pushOtherTeams", 2),
/* 77 */   d("pushOwnTeam", 3);
/*    */   static {
/* 79 */     g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.e, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, a> g;
/*    */   public final String e;
/*    */   public final int f;
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 87 */     return g.get(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   a(String ☃, int i) {
/* 94 */     this.e = ☃;
/* 95 */     this.f = i;
/*    */   }
/*    */   
/*    */   public nr b() {
/* 99 */     return new of("team.collision." + this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */