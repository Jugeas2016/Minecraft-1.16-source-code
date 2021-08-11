/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class wa
/*     */   extends ddn
/*     */ {
/*     */   private final MinecraftServer a;
/*  23 */   private final Set<ddk> b = Sets.newHashSet();
/*  24 */   private Runnable[] c = new Runnable[0];
/*     */   
/*     */   public wa(MinecraftServer ☃) {
/*  27 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ddm ☃) {
/*  36 */     super.a(☃);
/*     */     
/*  38 */     if (this.b.contains(☃.d())) {
/*  39 */       this.a.ae().a(new rj(a.a, ☃.d().b(), ☃.e(), ☃.b()));
/*     */     }
/*     */     
/*  42 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃) {
/*  47 */     super.a(☃);
/*  48 */     this.a.ae().a(new rj(a.b, null, ☃, 0));
/*  49 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, ddk ddk1) {
/*  54 */     super.a(☃, ddk1);
/*  55 */     if (this.b.contains(ddk1)) {
/*  56 */       this.a.ae().a(new rj(a.b, ddk1.b(), ☃, 0));
/*     */     }
/*  58 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, @Nullable ddk ddk1) {
/*  63 */     ddk ddk2 = a(☃);
/*     */     
/*  65 */     super.a(☃, ddk1);
/*     */     
/*  67 */     if (ddk2 != ddk1 && ddk2 != null) {
/*  68 */       if (h(ddk2) > 0) {
/*  69 */         this.a.ae().a(new qz(☃, ddk1));
/*     */       } else {
/*  71 */         g(ddk2);
/*     */       } 
/*     */     }
/*     */     
/*  75 */     if (ddk1 != null) {
/*  76 */       if (this.b.contains(ddk1)) {
/*  77 */         this.a.ae().a(new qz(☃, ddk1));
/*     */       } else {
/*  79 */         e(ddk1);
/*     */       } 
/*     */     }
/*     */     
/*  83 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃, ddl ddl1) {
/*  88 */     if (super.a(☃, ddl1)) {
/*  89 */       this.a.ae().a(new ri(ddl1, Arrays.asList(new String[] { ☃ }, ), 3));
/*  90 */       b();
/*     */       
/*  92 */       return true;
/*     */     } 
/*     */     
/*  95 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃, ddl ddl1) {
/* 100 */     super.b(☃, ddl1);
/*     */     
/* 102 */     this.a.ae().a(new ri(ddl1, Arrays.asList(new String[] { ☃ }, ), 4));
/*     */     
/* 104 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ddk ☃) {
/* 109 */     super.a(☃);
/* 110 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ddk ☃) {
/* 115 */     super.b(☃);
/*     */     
/* 117 */     if (this.b.contains(☃)) {
/* 118 */       this.a.ae().a(new rg(☃, 2));
/*     */     }
/*     */     
/* 121 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(ddk ☃) {
/* 126 */     super.c(☃);
/*     */     
/* 128 */     if (this.b.contains(☃)) {
/* 129 */       g(☃);
/*     */     }
/*     */     
/* 132 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ddl ☃) {
/* 137 */     super.a(☃);
/*     */     
/* 139 */     this.a.ae().a(new ri(☃, 0));
/*     */     
/* 141 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ddl ☃) {
/* 146 */     super.b(☃);
/*     */     
/* 148 */     this.a.ae().a(new ri(☃, 2));
/*     */     
/* 150 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(ddl ☃) {
/* 155 */     super.c(☃);
/*     */     
/* 157 */     this.a.ae().a(new ri(☃, 1));
/*     */     
/* 159 */     b();
/*     */   }
/*     */   
/*     */   public void a(Runnable ☃) {
/* 163 */     this.c = Arrays.<Runnable>copyOf(this.c, this.c.length + 1);
/* 164 */     this.c[this.c.length - 1] = ☃;
/*     */   }
/*     */   
/*     */   protected void b() {
/* 168 */     for (Runnable ☃ : this.c) {
/* 169 */       ☃.run();
/*     */     }
/*     */   }
/*     */   
/*     */   public List<oj<?>> d(ddk ☃) {
/* 174 */     List<oj<?>> list = Lists.newArrayList();
/* 175 */     list.add(new rg(☃, 0));
/*     */     
/* 177 */     for (int i = 0; i < 19; i++) {
/* 178 */       if (a(i) == ☃) {
/* 179 */         list.add(new qz(i, ☃));
/*     */       }
/*     */     } 
/*     */     
/* 183 */     for (ddm ddm : i(☃)) {
/* 184 */       list.add(new rj(a.a, ddm.d().b(), ddm.e(), ddm.b()));
/*     */     }
/*     */     
/* 187 */     return list;
/*     */   }
/*     */   
/*     */   public void e(ddk ☃) {
/* 191 */     List<oj<?>> list = d(☃);
/*     */     
/* 193 */     for (aah aah : this.a.ae().s()) {
/* 194 */       for (oj<?> oj : list) {
/* 195 */         aah.b.a(oj);
/*     */       }
/*     */     } 
/*     */     
/* 199 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public List<oj<?>> f(ddk ☃) {
/* 203 */     List<oj<?>> list = Lists.newArrayList();
/* 204 */     list.add(new rg(☃, 1));
/*     */     
/* 206 */     for (int i = 0; i < 19; i++) {
/* 207 */       if (a(i) == ☃) {
/* 208 */         list.add(new qz(i, ☃));
/*     */       }
/*     */     } 
/*     */     
/* 212 */     return list;
/*     */   }
/*     */   
/*     */   public void g(ddk ☃) {
/* 216 */     List<oj<?>> list = f(☃);
/*     */     
/* 218 */     for (aah aah : this.a.ae().s()) {
/* 219 */       for (oj<?> oj : list) {
/* 220 */         aah.b.a(oj);
/*     */       }
/*     */     } 
/*     */     
/* 224 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public int h(ddk ☃) {
/* 228 */     int i = 0;
/*     */     
/* 230 */     for (int j = 0; j < 19; j++) {
/* 231 */       if (a(j) == ☃) {
/* 232 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 236 */     return i;
/*     */   }
/*     */   
/*     */   public enum a {
/* 240 */     a,
/* 241 */     b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */