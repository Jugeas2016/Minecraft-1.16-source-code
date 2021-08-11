/*     */ import com.google.common.collect.Lists;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class pt
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private md d;
/*     */   @Nullable
/*     */   private int[] e;
/*     */   private byte[] f;
/*     */   private List<md> g;
/*     */   private boolean h;
/*     */   
/*     */   public pt() {}
/*     */   
/*     */   public pt(cgh ☃, int i) {
/*  41 */     brd brd = ☃.g();
/*  42 */     this.a = brd.b;
/*  43 */     this.b = brd.c;
/*  44 */     this.h = (i == 65535);
/*     */     
/*  46 */     this.d = new md();
/*  47 */     for (Map.Entry<chn.a, chn> entry : ☃.f()) {
/*  48 */       if (!((chn.a)entry.getKey()).c()) {
/*     */         continue;
/*     */       }
/*  51 */       this.d.a(((chn.a)entry.getKey()).b(), new mk(((chn)entry.getValue()).a()));
/*     */     } 
/*     */     
/*  54 */     if (this.h) {
/*  55 */       this.e = ☃.i().a();
/*     */     }
/*     */     
/*  58 */     this.f = new byte[a(☃, i)];
/*  59 */     this.c = a(new nf(j()), ☃, i);
/*     */     
/*  61 */     this.g = Lists.newArrayList();
/*  62 */     for (Map.Entry<fx, ccj> entry : ☃.y().entrySet()) {
/*  63 */       fx fx = entry.getKey();
/*  64 */       ccj ccj = entry.getValue();
/*     */       
/*  66 */       int j = fx.v() >> 4;
/*  67 */       if (!f() && (i & 1 << j) == 0) {
/*     */         continue;
/*     */       }
/*     */       
/*  71 */       md md1 = ccj.b();
/*  72 */       this.g.add(md1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  78 */     this.a = ☃.readInt();
/*  79 */     this.b = ☃.readInt();
/*  80 */     this.h = ☃.readBoolean();
/*  81 */     this.c = ☃.i();
/*  82 */     this.d = ☃.l();
/*     */     
/*  84 */     if (this.h) {
/*  85 */       this.e = ☃.c(cfx.a);
/*     */     }
/*  87 */     int i = ☃.i();
/*  88 */     if (i > 2097152) {
/*  89 */       throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
/*     */     }
/*     */     
/*  92 */     this.f = new byte[i];
/*  93 */     ☃.readBytes(this.f);
/*     */     
/*  95 */     int j = ☃.i();
/*  96 */     this.g = Lists.newArrayList();
/*  97 */     for (int k = 0; k < j; k++) {
/*  98 */       this.g.add(☃.l());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 104 */     ☃.writeInt(this.a);
/* 105 */     ☃.writeInt(this.b);
/* 106 */     ☃.writeBoolean(this.h);
/* 107 */     ☃.d(this.c);
/* 108 */     ☃.a(this.d);
/* 109 */     if (this.e != null) {
/* 110 */       ☃.a(this.e);
/*     */     }
/* 112 */     ☃.d(this.f.length);
/* 113 */     ☃.writeBytes(this.f);
/*     */     
/* 115 */     ☃.d(this.g.size());
/* 116 */     for (md md1 : this.g) {
/* 117 */       ☃.a(md1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 123 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public nf b() {
/* 127 */     return new nf(Unpooled.wrappedBuffer(this.f));
/*     */   }
/*     */   
/*     */   private ByteBuf j() {
/* 131 */     ByteBuf ☃ = Unpooled.wrappedBuffer(this.f);
/* 132 */     ☃.writerIndex(0);
/* 133 */     return ☃;
/*     */   }
/*     */   
/*     */   public int a(nf ☃, cgh cgh1, int i) {
/* 137 */     int j = 0;
/*     */     
/* 139 */     cgi[] arrayOfCgi = cgh1.d();
/* 140 */     for (int k = 0, m = arrayOfCgi.length; k < m; k++) {
/* 141 */       cgi cgi = arrayOfCgi[k];
/*     */       
/* 143 */       if (cgi != cgh.a && (!f() || !cgi.c()) && (i & 1 << k) != 0) {
/*     */ 
/*     */ 
/*     */         
/* 147 */         j |= 1 << k;
/*     */         
/* 149 */         cgi.b(☃);
/*     */       } 
/*     */     } 
/* 152 */     return j;
/*     */   }
/*     */   
/*     */   protected int a(cgh ☃, int i) {
/* 156 */     int j = 0;
/*     */     
/* 158 */     cgi[] arrayOfCgi = ☃.d();
/* 159 */     for (int k = 0, m = arrayOfCgi.length; k < m; k++) {
/* 160 */       cgi cgi = arrayOfCgi[k];
/*     */       
/* 162 */       if (cgi != cgh.a && (!f() || !cgi.c()) && (i & 1 << k) != 0)
/*     */       {
/*     */ 
/*     */         
/* 166 */         j += cgi.j();
/*     */       }
/*     */     } 
/* 169 */     return j;
/*     */   }
/*     */   
/*     */   public int c() {
/* 173 */     return this.a;
/*     */   }
/*     */   
/*     */   public int d() {
/* 177 */     return this.b;
/*     */   }
/*     */   
/*     */   public int e() {
/* 181 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 185 */     return this.h;
/*     */   }
/*     */   
/*     */   public md g() {
/* 189 */     return this.d;
/*     */   }
/*     */   
/*     */   public List<md> h() {
/* 193 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public int[] i() {
/* 198 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */