/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djg
/*    */   extends dja
/*    */ {
/*    */   private final String c;
/*    */   private final String d;
/*    */   private final long e;
/*    */   private final dot f;
/*    */   
/*    */   public djg(long ☃, String str1, String str2, dot dot1) {
/* 15 */     this.e = ☃;
/* 16 */     this.c = str1;
/* 17 */     this.d = str2;
/* 18 */     this.f = dot1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 23 */     b(new of("mco.create.world.wait"));
/* 24 */     dgb ☃ = dgb.a();
/*    */     
/*    */     try {
/* 27 */       ☃.a(this.e, this.c, this.d);
/* 28 */       a(this.f);
/* 29 */     } catch (dhi dhi) {
/* 30 */       a.error("Couldn't create world");
/* 31 */       a(dhi.toString());
/* 32 */     } catch (Exception exception) {
/* 33 */       a.error("Could not create world");
/* 34 */       a(exception.getLocalizedMessage());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */