/*     */ import java.util.EnumSet;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bbj
/*     */   extends bbe
/*     */ {
/*     */   private int bw;
/*     */   
/*     */   public bbj(aqe<? extends bbj> ☃, brx brx1) {
/*  27 */     super((aqe)☃, brx1);
/*  28 */     this.bw = 47999;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean fu() {
/*  33 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bbe fz() {
/*  38 */     return aqe.aL.a(this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  43 */     super.b(☃);
/*  44 */     ☃.b("DespawnDelay", this.bw);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  49 */     super.a(☃);
/*  50 */     if (☃.c("DespawnDelay", 99)) {
/*  51 */       this.bw = ☃.h("DespawnDelay");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  57 */     super.o();
/*     */     
/*  59 */     this.bk.a(1, new awp(this, 2.0D));
/*     */     
/*  61 */     this.bl.a(1, new a(this, this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void h(bfw ☃) {
/*  70 */     aqa aqa = eC();
/*  71 */     if (aqa instanceof bfp) {
/*     */       return;
/*     */     }
/*     */     
/*  75 */     super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  80 */     super.k();
/*     */     
/*  82 */     if (!this.l.v) {
/*  83 */       fE();
/*     */     }
/*     */   }
/*     */   
/*     */   private void fE() {
/*  88 */     if (!fF()) {
/*     */       return;
/*     */     }
/*     */     
/*  92 */     this.bw = fG() ? (((bfp)eC()).eX() - 1) : (this.bw - 1);
/*     */     
/*  94 */     if (this.bw <= 0) {
/*  95 */       a(true, false);
/*  96 */       ad();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean fF() {
/* 101 */     return (!eW() && 
/* 102 */       !fH() && 
/* 103 */       !cq());
/*     */   }
/*     */   
/*     */   private boolean fG() {
/* 107 */     return eC() instanceof bfp;
/*     */   }
/*     */   
/*     */   private boolean fH() {
/* 111 */     return (eB() && !fG());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 117 */     if (aqp1 == aqp.h) {
/* 118 */       c_(0);
/*     */     }
/*     */     
/* 121 */     if (arc1 == null) {
/* 122 */       arc1 = new apy.a(false);
/*     */     }
/*     */     
/* 125 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public class a extends axx {
/*     */     private final bbe b;
/*     */     private aqm c;
/*     */     private int d;
/*     */     
/*     */     public a(bbj ☃, bbe bbe1) {
/* 134 */       super(bbe1, false);
/* 135 */       this.b = bbe1;
/* 136 */       a(EnumSet.of(avv.a.d));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 141 */       if (!this.b.eB()) {
/* 142 */         return false;
/*     */       }
/* 144 */       aqa ☃ = this.b.eC();
/* 145 */       if (!(☃ instanceof bfp)) {
/* 146 */         return false;
/*     */       }
/*     */       
/* 149 */       bfp bfp = (bfp)☃;
/* 150 */       this.c = bfp.cZ();
/* 151 */       int i = bfp.da();
/* 152 */       return (i != this.d && a(this.c, azg.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 157 */       this.e.h(this.c);
/*     */       
/* 159 */       aqa ☃ = this.b.eC();
/* 160 */       if (☃ instanceof bfp) {
/* 161 */         this.d = ((bfp)☃).da();
/*     */       }
/*     */       
/* 164 */       super.c();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */