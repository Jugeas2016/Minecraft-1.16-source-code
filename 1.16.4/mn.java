/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutput;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.GZIPOutputStream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mn
/*     */ {
/*     */   public static md a(File ☃) throws IOException {
/*  25 */     try (InputStream ☃ = new FileInputStream(☃)) {
/*  26 */       return a(inputStream);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static md a(InputStream ☃) throws IOException {
/*  31 */     try (DataInputStream ☃ = new DataInputStream(new BufferedInputStream(new GZIPInputStream(☃)))) {
/*  32 */       return a(dataInputStream, mm.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(md ☃, File file) throws IOException {
/*  37 */     try (OutputStream ☃ = new FileOutputStream(file)) {
/*  38 */       a(☃, outputStream);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(md ☃, OutputStream outputStream) throws IOException {
/*  43 */     try (DataOutputStream ☃ = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)))) {
/*  44 */       a(☃, dataOutputStream);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void b(md ☃, File file) throws IOException {
/*  50 */     try(FileOutputStream ☃ = new FileOutputStream(file); 
/*  51 */         DataOutputStream ☃ = new DataOutputStream(fileOutputStream)) {
/*     */       
/*  53 */       a(☃, dataOutputStream);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static md b(File ☃) throws IOException {
/*  59 */     if (!☃.exists()) {
/*  60 */       return null;
/*     */     }
/*     */     
/*  63 */     try(FileInputStream ☃ = new FileInputStream(☃); 
/*  64 */         DataInputStream ☃ = new DataInputStream(fileInputStream)) {
/*     */       
/*  66 */       return a(dataInputStream, mm.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static md a(DataInput ☃) throws IOException {
/*  71 */     return a(☃, mm.a);
/*     */   }
/*     */   
/*     */   public static md a(DataInput ☃, mm mm1) throws IOException {
/*  75 */     mt mt = a(☃, 0, mm1);
/*  76 */     if (mt instanceof md) {
/*  77 */       return (md)mt;
/*     */     }
/*  79 */     throw new IOException("Root tag must be a named compound tag");
/*     */   }
/*     */   
/*     */   public static void a(md ☃, DataOutput dataOutput) throws IOException {
/*  83 */     a(☃, dataOutput);
/*     */   }
/*     */   
/*     */   private static void a(mt ☃, DataOutput dataOutput) throws IOException {
/*  87 */     dataOutput.writeByte(☃.a());
/*  88 */     if (☃.a() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  93 */     dataOutput.writeUTF("");
/*     */     
/*  95 */     ☃.a(dataOutput);
/*     */   }
/*     */   
/*     */   private static mt a(DataInput ☃, int i, mm mm1) throws IOException {
/*  99 */     byte b = ☃.readByte();
/* 100 */     if (b == 0) {
/* 101 */       return mf.b;
/*     */     }
/*     */ 
/*     */     
/* 105 */     ☃.readUTF();
/*     */     
/*     */     try {
/* 108 */       return (mt)mw.a(b).b(☃, i, mm1);
/* 109 */     } catch (IOException iOException) {
/* 110 */       l l = l.a(iOException, "Loading NBT data");
/* 111 */       m m = l.a("NBT Tag");
/* 112 */       m.a("Tag type", Byte.valueOf(b));
/* 113 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */