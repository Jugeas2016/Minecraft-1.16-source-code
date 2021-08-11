/*    */ import com.mojang.authlib.GameProfile;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringUtils;
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
/*    */ public class byt
/*    */   extends bzv
/*    */ {
/*    */   protected byt(ceg.c ☃) {
/* 20 */     super(bzv.b.c, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/* 25 */     super.a(☃, fx1, ceh1, aqm1, bmb1);
/*    */     
/* 27 */     ccj ccj = ☃.c(fx1);
/*    */     
/* 29 */     if (ccj instanceof cdg) {
/* 30 */       cdg cdg = (cdg)ccj;
/* 31 */       GameProfile gameProfile = null;
/* 32 */       if (bmb1.n()) {
/* 33 */         md md = bmb1.o();
/*    */ 
/*    */         
/* 36 */         if (md.c("SkullOwner", 10)) {
/* 37 */           gameProfile = mp.a(md.p("SkullOwner"));
/* 38 */         } else if (md.c("SkullOwner", 8) && !StringUtils.isBlank(md.l("SkullOwner"))) {
/* 39 */           gameProfile = new GameProfile(null, md.l("SkullOwner"));
/*    */         } 
/*    */       } 
/*    */       
/* 43 */       cdg.a(gameProfile);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */