/*    */ import com.mojang.authlib.GameProfile;
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
/*    */ public class bmm
/*    */   extends bnd
/*    */ {
/*    */   public bmm(buo ☃, buo buo1, blx.a a1) {
/* 17 */     super(☃, buo1, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr h(bmb ☃) {
/* 22 */     if (☃.b() == bmd.pg && ☃.n()) {
/* 23 */       String str = null;
/* 24 */       md md = ☃.o();
/* 25 */       if (md.c("SkullOwner", 8)) {
/* 26 */         str = md.l("SkullOwner");
/* 27 */       } else if (md.c("SkullOwner", 10)) {
/* 28 */         md md1 = md.p("SkullOwner");
/* 29 */         if (md1.c("Name", 8)) {
/* 30 */           str = md1.l("Name");
/*    */         }
/*    */       } 
/* 33 */       if (str != null) {
/* 34 */         return new of(a() + ".named", new Object[] { str });
/*    */       }
/*    */     } 
/* 37 */     return super.h(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(md ☃) {
/* 42 */     super.b(☃);
/* 43 */     if (☃.c("SkullOwner", 8) && !StringUtils.isBlank(☃.l("SkullOwner"))) {
/* 44 */       GameProfile gameProfile = new GameProfile(null, ☃.l("SkullOwner"));
/* 45 */       gameProfile = cdg.b(gameProfile);
/* 46 */       ☃.a("SkullOwner", mp.a(new md(), gameProfile));
/* 47 */       return true;
/*    */     } 
/* 49 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */