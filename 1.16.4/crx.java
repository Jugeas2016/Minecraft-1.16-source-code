/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class crx
/*     */   extends cru
/*     */ {
/*  30 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   protected ctb a;
/*     */   protected csx b;
/*     */   protected fx c;
/*     */   
/*     */   public crx(clb ☃, int i) {
/*  37 */     super(☃, i);
/*     */   }
/*     */   
/*     */   public crx(clb ☃, md md1) {
/*  41 */     super(☃, md1);
/*  42 */     this.c = new fx(md1.h("TPX"), md1.h("TPY"), md1.h("TPZ"));
/*     */   }
/*     */   
/*     */   protected void a(ctb ☃, fx fx1, csx csx1) {
/*  46 */     this.a = ☃;
/*  47 */     a(gc.c);
/*  48 */     this.c = fx1;
/*  49 */     this.b = csx1;
/*  50 */     this.n = ☃.b(csx1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  55 */     ☃.b("TPX", this.c.u());
/*  56 */     ☃.b("TPY", this.c.v());
/*  57 */     ☃.b("TPZ", this.c.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  62 */     this.b.a(cra1);
/*     */     
/*  64 */     this.n = this.a.b(this.b, this.c);
/*  65 */     if (this.a.a(☃, this.c, fx1, this.b, random, 2)) {
/*  66 */       List<ctb.c> list1 = this.a.a(this.c, this.b, bup.mY);
/*  67 */       for (ctb.c c : list1) {
/*  68 */         if (c.c == null) {
/*     */           continue;
/*     */         }
/*     */         
/*  72 */         cfo cfo = cfo.valueOf(c.c.l("mode"));
/*  73 */         if (cfo != cfo.d) {
/*     */           continue;
/*     */         }
/*     */         
/*  77 */         a(c.c.l("metadata"), c.a, ☃, random, cra1);
/*     */       } 
/*     */       
/*  80 */       List<ctb.c> list2 = this.a.a(this.c, this.b, bup.mZ);
/*  81 */       for (ctb.c c : list2) {
/*  82 */         if (c.c == null) {
/*     */           continue;
/*     */         }
/*     */         
/*  86 */         String str = c.c.l("final_state");
/*  87 */         ei ei = new ei(new StringReader(str), false);
/*  88 */         ceh ceh = bup.a.n();
/*     */         try {
/*  90 */           ei.a(true);
/*  91 */           ceh ceh1 = ei.b();
/*     */           
/*  93 */           if (ceh1 != null) {
/*  94 */             ceh = ceh1;
/*     */           } else {
/*  96 */             d.error("Error while parsing blockstate {} in jigsaw block @ {}", str, c.a);
/*     */           } 
/*  98 */         } catch (CommandSyntaxException commandSyntaxException) {
/*  99 */           d.error("Error while parsing blockstate {} in jigsaw block @ {}", str, c.a);
/*     */         } 
/*     */         
/* 102 */         ☃.a(c.a, ceh, 3);
/*     */       } 
/*     */     } 
/*     */     
/* 106 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(String paramString, fx paramfx, bsk parambsk, Random paramRandom, cra paramcra);
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 113 */     super.a(☃, i, j);
/* 114 */     this.c = this.c.b(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzm ap_() {
/* 119 */     return this.b.d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */